package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TempleHindu: ImageVector
    get() {
        if (_TempleHindu != null) {
            return _TempleHindu!!
        }
        _TempleHindu = ImageVector.Builder(
            name = "TempleHindu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.6f, 11f)
                horizontalLineTo(17.4f)
                lineTo(16.5f, 8f)
                horizontalLineTo(7.5f)
                lineTo(6.6f, 11f)
                moveTo(20f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                moveTo(15.9f, 6f)
                lineTo(15f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(9f)
                verticalLineTo(3.1f)
                lineTo(8.1f, 6f)
                horizontalLineTo(15.9f)
                close()
            }
        }.build()

        return _TempleHindu!!
    }

@Suppress("ObjectPropertyName")
private var _TempleHindu: ImageVector? = null
