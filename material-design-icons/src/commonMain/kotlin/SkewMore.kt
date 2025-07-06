package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkewMore: ImageVector
    get() {
        if (_SkewMore != null) {
            return _SkewMore!!
        }
        _SkewMore = ImageVector.Builder(
            name = "SkewMore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 11f)
                lineTo(10.41f, 20f)
                horizontalLineTo(5.5f)
                lineTo(7.59f, 11f)
                horizontalLineTo(12.5f)
                moveTo(15f, 9f)
                horizontalLineTo(6f)
                lineTo(3f, 22f)
                horizontalLineTo(12f)
                lineTo(15f, 9f)
                moveTo(21f, 6f)
                lineTo(17f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                lineTo(21f, 6f)
                close()
            }
        }.build()

        return _SkewMore!!
    }

@Suppress("ObjectPropertyName")
private var _SkewMore: ImageVector? = null
