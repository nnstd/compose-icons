package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudCancelOutline: ImageVector
    get() {
        if (_CloudCancelOutline != null) {
            return _CloudCancelOutline!!
        }
        _CloudCancelOutline = ImageVector.Builder(
            name = "CloudCancelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.5f)
                curveTo(12f, 19f, 12.07f, 19.5f, 12.18f, 20f)
                horizontalLineTo(6.5f)
                curveTo(5f, 20f, 3.69f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1f, 16.09f, 1f, 14.58f)
                curveTo(1f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                reflectiveCurveTo(4f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                reflectiveCurveTo(10.42f, 4f, 12f, 4f)
                curveTo(13.95f, 4f, 15.6f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.4f, 19f, 9.05f, 19f, 11f)
                curveTo(20.15f, 11.13f, 21.1f, 11.63f, 21.86f, 12.5f)
                curveTo(22.1f, 12.76f, 22.29f, 13.05f, 22.46f, 13.36f)
                curveTo(21.36f, 12.5f, 20f, 12f, 18.5f, 12f)
                curveTo(18f, 12f, 17.5f, 12.07f, 17f, 12.18f)
                verticalLineTo(11f)
                curveTo(17f, 9.62f, 16.5f, 8.44f, 15.54f, 7.46f)
                curveTo(14.56f, 6.5f, 13.38f, 6f, 12f, 6f)
                reflectiveCurveTo(9.44f, 6.5f, 8.46f, 7.46f)
                curveTo(7.5f, 8.44f, 7f, 9.62f, 7f, 11f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 11f, 4.71f, 11.34f, 4.03f, 12.03f)
                curveTo(3.34f, 12.71f, 3f, 13.53f, 3f, 14.5f)
                reflectiveCurveTo(3.34f, 16.29f, 4.03f, 17f)
                curveTo(4.71f, 17.66f, 5.53f, 18f, 6.5f, 18f)
                horizontalLineTo(12.03f)
                curveTo(12f, 18.17f, 12f, 18.33f, 12f, 18.5f)
                moveTo(23f, 18.5f)
                curveTo(23f, 21f, 21f, 23f, 18.5f, 23f)
                reflectiveCurveTo(14f, 21f, 14f, 18.5f)
                reflectiveCurveTo(16f, 14f, 18.5f, 14f)
                reflectiveCurveTo(23f, 16f, 23f, 18.5f)
                moveTo(20f, 21.08f)
                lineTo(15.92f, 17f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17f, 15.92f)
                lineTo(21.08f, 20f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }.build()

        return _CloudCancelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCancelOutline: ImageVector? = null
