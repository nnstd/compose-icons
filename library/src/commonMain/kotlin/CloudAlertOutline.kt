package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudAlertOutline: ImageVector
    get() {
        if (_CloudAlertOutline != null) {
            return _CloudAlertOutline!!
        }
        _CloudAlertOutline = ImageVector.Builder(
            name = "CloudAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.86f, 12.5f)
                curveTo(21.1f, 11.63f, 20.15f, 11.13f, 19f, 11f)
                curveTo(19f, 9.05f, 18.32f, 7.4f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4f, 12f, 4f)
                curveTo(10.42f, 4f, 9f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1f, 13.28f, 1f, 14.58f)
                curveTo(1f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5f, 20f, 6.5f, 20f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 20f, 20.81f, 19.56f, 21.69f, 18.69f)
                curveTo(22.56f, 17.81f, 23f, 16.75f, 23f, 15.5f)
                curveTo(23f, 14.35f, 22.62f, 13.35f, 21.86f, 12.5f)
                moveTo(20.27f, 17.27f)
                curveTo(19.79f, 17.76f, 19.2f, 18f, 18.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 18f, 4.71f, 17.66f, 4.03f, 17f)
                curveTo(3.34f, 16.29f, 3f, 15.47f, 3f, 14.5f)
                reflectiveCurveTo(3.34f, 12.71f, 4.03f, 12.03f)
                curveTo(4.71f, 11.34f, 5.53f, 11f, 6.5f, 11f)
                horizontalLineTo(7f)
                curveTo(7f, 9.62f, 7.5f, 8.44f, 8.46f, 7.46f)
                curveTo(9.44f, 6.5f, 10.62f, 6f, 12f, 6f)
                reflectiveCurveTo(14.56f, 6.5f, 15.54f, 7.46f)
                curveTo(16.5f, 8.44f, 17f, 9.62f, 17f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(18.5f)
                curveTo(19.2f, 13f, 19.79f, 13.24f, 20.27f, 13.73f)
                reflectiveCurveTo(21f, 14.8f, 21f, 15.5f)
                reflectiveCurveTo(20.76f, 16.79f, 20.27f, 17.27f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _CloudAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudAlertOutline: ImageVector? = null
