package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudKeyOutline: ImageVector
    get() {
        if (_CloudKeyOutline != null) {
            return _CloudKeyOutline!!
        }
        _CloudKeyOutline = ImageVector.Builder(
            name = "CloudKeyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.41f, 20f)
                horizontalLineTo(6.5f)
                curveTo(5f, 20f, 3.68f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1f, 16.09f, 1f, 14.58f)
                curveTo(1f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                curveTo(2.96f, 10.08f, 4f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                curveTo(9f, 4.5f, 10.42f, 4f, 12f, 4f)
                curveTo(13.95f, 4f, 15.61f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.39f, 19f, 9.05f, 19f, 11f)
                curveTo(20.15f, 11.13f, 21.11f, 11.63f, 21.86f, 12.5f)
                curveTo(22.5f, 13.23f, 22.86f, 14.06f, 22.96f, 15f)
                horizontalLineTo(20.96f)
                curveTo(20.86f, 14.5f, 20.64f, 14.09f, 20.27f, 13.73f)
                curveTo(19.79f, 13.24f, 19.2f, 13f, 18.5f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                curveTo(17f, 9.62f, 16.5f, 8.44f, 15.54f, 7.46f)
                curveTo(14.57f, 6.5f, 13.39f, 6f, 12f, 6f)
                curveTo(10.62f, 6f, 9.44f, 6.5f, 8.46f, 7.46f)
                curveTo(7.5f, 8.44f, 7f, 9.62f, 7f, 11f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 11f, 4.71f, 11.34f, 4.03f, 12.03f)
                curveTo(3.34f, 12.71f, 3f, 13.53f, 3f, 14.5f)
                reflectiveCurveTo(3.34f, 16.3f, 4.03f, 17f)
                curveTo(4.71f, 17.67f, 5.53f, 18f, 6.5f, 18f)
                horizontalLineTo(9f)
                curveTo(9f, 18.72f, 9.15f, 19.39f, 9.41f, 20f)
                moveTo(23f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(16.8f)
                curveTo(16.4f, 20.2f, 15.3f, 21f, 14f, 21f)
                curveTo(12.3f, 21f, 11f, 19.7f, 11f, 18f)
                reflectiveCurveTo(12.3f, 15f, 14f, 15f)
                curveTo(15.3f, 15f, 16.4f, 15.8f, 16.8f, 17f)
                horizontalLineTo(23f)
                moveTo(15f, 18f)
                curveTo(15f, 17.5f, 14.6f, 17f, 14f, 17f)
                reflectiveCurveTo(13f, 17.5f, 13f, 18f)
                reflectiveCurveTo(13.4f, 19f, 14f, 19f)
                reflectiveCurveTo(15f, 18.5f, 15f, 18f)
                close()
            }
        }.build()

        return _CloudKeyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudKeyOutline: ImageVector? = null
