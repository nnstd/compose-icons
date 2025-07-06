package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCowboyHat: ImageVector
    get() {
        if (_AccountCowboyHat != null) {
            return _AccountCowboyHat!!
        }
        _AccountCowboyHat = ImageVector.Builder(
            name = "AccountCowboyHat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                curveTo(4f, 17.8f, 7.6f, 16f, 12f, 16f)
                reflectiveCurveTo(20f, 17.8f, 20f, 20f)
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                curveTo(16f, 12.2f, 14.2f, 14f, 12f, 14f)
                reflectiveCurveTo(8f, 12.2f, 8f, 10f)
                moveTo(19f, 4f)
                curveTo(18.4f, 4f, 18f, 4.4f, 18f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(16.5f)
                lineTo(15.1f, 3f)
                curveTo(15f, 2.8f, 14.9f, 2.6f, 14.7f, 2.5f)
                curveTo(14.2f, 2f, 13.4f, 1.9f, 12.7f, 2.2f)
                lineTo(12f, 2.4f)
                lineTo(11.3f, 2.1f)
                curveTo(10.6f, 1.8f, 9.8f, 1.9f, 9.3f, 2.4f)
                curveTo(9.1f, 2.6f, 9f, 2.8f, 8.9f, 3f)
                lineTo(7.5f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                curveTo(6f, 4.4f, 5.6f, 4f, 5f, 4f)
                reflectiveCurveTo(4f, 4.4f, 4f, 5f)
                verticalLineTo(6f)
                curveTo(4f, 7.1f, 4.9f, 8f, 6f, 8f)
                horizontalLineTo(18f)
                curveTo(19.1f, 8f, 20f, 7.1f, 20f, 6f)
                verticalLineTo(5f)
                curveTo(20f, 4.5f, 19.6f, 4f, 19f, 4f)
                close()
            }
        }.build()

        return _AccountCowboyHat!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCowboyHat: ImageVector? = null
