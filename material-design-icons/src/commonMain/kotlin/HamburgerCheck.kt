package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HamburgerCheck: ImageVector
    get() {
        if (_HamburgerCheck != null) {
            return _HamburgerCheck!!
        }
        _HamburgerCheck = ImageVector.Builder(
            name = "HamburgerCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                horizontalLineTo(3f)
                curveTo(3f, 9f, 3f, 3f, 12f, 3f)
                reflectiveCurveTo(21f, 9f, 21f, 9f)
                moveTo(13.35f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                curveTo(3f, 19.66f, 4.34f, 21f, 6f, 21f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13f, 19.7f, 13f, 19f)
                curveTo(13f, 18.3f, 13.13f, 17.63f, 13.35f, 17f)
                moveTo(21.86f, 13.73f)
                curveTo(21.95f, 13.5f, 22f, 13.26f, 22f, 13f)
                curveTo(22f, 11.9f, 21.11f, 11f, 20f, 11f)
                horizontalLineTo(11f)
                lineTo(8.5f, 13f)
                lineTo(6f, 11f)
                horizontalLineTo(4f)
                curveTo(2.9f, 11f, 2f, 11.9f, 2f, 13f)
                reflectiveCurveTo(2.9f, 15f, 4f, 15f)
                horizontalLineTo(14.54f)
                curveTo(15.64f, 13.78f, 17.23f, 13f, 19f, 13f)
                curveTo(20.04f, 13f, 21f, 13.26f, 21.86f, 13.73f)
                moveTo(21.34f, 15.84f)
                lineTo(17.75f, 19.43f)
                lineTo(16.16f, 17.84f)
                lineTo(15f, 19f)
                lineTo(17.75f, 22f)
                lineTo(22.5f, 17.25f)
                lineTo(21.34f, 15.84f)
                close()
            }
        }.build()

        return _HamburgerCheck!!
    }

@Suppress("ObjectPropertyName")
private var _HamburgerCheck: ImageVector? = null
