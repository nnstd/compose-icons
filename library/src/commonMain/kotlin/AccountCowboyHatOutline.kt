package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCowboyHatOutline: ImageVector
    get() {
        if (_AccountCowboyHatOutline != null) {
            return _AccountCowboyHatOutline!!
        }
        _AccountCowboyHatOutline = ImageVector.Builder(
            name = "AccountCowboyHatOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(4f, 22f)
                verticalLineTo(19f)
                curveTo(4f, 16.33f, 9.33f, 15f, 12f, 15f)
                reflectiveCurveTo(20f, 16.33f, 20f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                moveTo(18.1f, 20.1f)
                verticalLineTo(19f)
                curveTo(18.1f, 18.36f, 14.97f, 16.9f, 12f, 16.9f)
                reflectiveCurveTo(5.9f, 18.36f, 5.9f, 19f)
                verticalLineTo(20.1f)
                horizontalLineTo(18.1f)
                moveTo(16f, 9f)
                verticalLineTo(10f)
                curveTo(16f, 12.21f, 14.21f, 14f, 12f, 14f)
                reflectiveCurveTo(8f, 12.21f, 8f, 10f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                curveTo(10f, 11.11f, 10.9f, 12f, 12f, 12f)
                reflectiveCurveTo(14f, 11.11f, 14f, 10f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _AccountCowboyHatOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCowboyHatOutline: ImageVector? = null
