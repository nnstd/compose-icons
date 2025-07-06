package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagMinus: ImageVector
    get() {
        if (_FlagMinus != null) {
            return _FlagMinus!!
        }
        _FlagMinus = ImageVector.Builder(
            name = "FlagMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.4f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                lineTo(10.6f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                lineTo(12.4f, 5f)
                moveTo(14f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _FlagMinus!!
    }

@Suppress("ObjectPropertyName")
private var _FlagMinus: ImageVector? = null
