package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SocialDistance2Meters: ImageVector
    get() {
        if (_SocialDistance2Meters != null) {
            return _SocialDistance2Meters!!
        }
        _SocialDistance2Meters = ImageVector.Builder(
            name = "SocialDistance2Meters",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6f)
                curveTo(7.1f, 6f, 8f, 5.1f, 8f, 4f)
                reflectiveCurveTo(7.1f, 2f, 6f, 2f)
                reflectiveCurveTo(4f, 2.9f, 4f, 4f)
                reflectiveCurveTo(4.9f, 6f, 6f, 6f)
                moveTo(10f, 9.43f)
                curveTo(10f, 8.62f, 9.5f, 7.9f, 8.78f, 7.58f)
                curveTo(7.93f, 7.21f, 7f, 7f, 6f, 7f)
                reflectiveCurveTo(4.07f, 7.21f, 3.22f, 7.58f)
                curveTo(2.5f, 7.9f, 2f, 8.62f, 2f, 9.43f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(9.43f)
                moveTo(18f, 6f)
                curveTo(19.1f, 6f, 20f, 5.1f, 20f, 4f)
                reflectiveCurveTo(19.1f, 2f, 18f, 2f)
                reflectiveCurveTo(16f, 2.9f, 16f, 4f)
                reflectiveCurveTo(16.9f, 6f, 18f, 6f)
                moveTo(22f, 9.43f)
                curveTo(22f, 8.62f, 21.5f, 7.9f, 20.78f, 7.58f)
                curveTo(19.93f, 7.21f, 19f, 7f, 18f, 7f)
                reflectiveCurveTo(16.07f, 7.21f, 15.22f, 7.58f)
                curveTo(14.5f, 7.9f, 14f, 8.62f, 14f, 9.43f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(9.43f)
                moveTo(19f, 17f)
                verticalLineTo(15f)
                lineTo(5f, 15f)
                verticalLineTo(17f)
                lineTo(2f, 14f)
                lineTo(5f, 11f)
                verticalLineTo(13f)
                lineTo(19f, 13f)
                verticalLineTo(11f)
                lineTo(22f, 14f)
                lineTo(19f, 17f)
                moveTo(9f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20.5f)
                curveTo(8f, 19.95f, 8.45f, 19.5f, 9f, 19.5f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                curveTo(10.55f, 18f, 11f, 18.45f, 11f, 19f)
                verticalLineTo(19.5f)
                curveTo(11f, 20.05f, 10.55f, 20.5f, 10f, 20.5f)
                horizontalLineTo(9f)
                moveTo(16f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(14.5f)
                verticalLineTo(21f)
                horizontalLineTo(13.5f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                curveTo(12f, 18.45f, 12.45f, 18f, 13f, 18f)
                horizontalLineTo(15f)
                curveTo(15.55f, 18f, 16f, 18.45f, 16f, 19f)
                close()
            }
        }.build()

        return _SocialDistance2Meters!!
    }

@Suppress("ObjectPropertyName")
private var _SocialDistance2Meters: ImageVector? = null
