package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hamburger: ImageVector
    get() {
        if (_Hamburger != null) {
            return _Hamburger!!
        }
        _Hamburger = ImageVector.Builder(
            name = "Hamburger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                curveTo(22f, 14.11f, 21.11f, 15f, 20f, 15f)
                horizontalLineTo(4f)
                curveTo(2.9f, 15f, 2f, 14.11f, 2f, 13f)
                reflectiveCurveTo(2.9f, 11f, 4f, 11f)
                horizontalLineTo(13f)
                lineTo(15.5f, 13f)
                lineTo(18f, 11f)
                horizontalLineTo(20f)
                curveTo(21.11f, 11f, 22f, 11.9f, 22f, 13f)
                moveTo(12f, 3f)
                curveTo(3f, 3f, 3f, 9f, 3f, 9f)
                horizontalLineTo(21f)
                curveTo(21f, 9f, 21f, 3f, 12f, 3f)
                moveTo(3f, 18f)
                curveTo(3f, 19.66f, 4.34f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(19.66f, 21f, 21f, 19.66f, 21f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Hamburger!!
    }

@Suppress("ObjectPropertyName")
private var _Hamburger: ImageVector? = null
