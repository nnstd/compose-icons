package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudSyncOutline: ImageVector
    get() {
        if (_CloudSyncOutline != null) {
            return _CloudSyncOutline!!
        }
        _CloudSyncOutline = ImageVector.Builder(
            name = "CloudSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.03f, 18f)
                curveTo(13.08f, 18.7f, 13.24f, 19.38f, 13.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(5f, 20f, 3.69f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1f, 16.09f, 1f, 14.58f)
                curveTo(1f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                reflectiveCurveTo(4f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                reflectiveCurveTo(10.42f, 4f, 12f, 4f)
                curveTo(13.95f, 4f, 15.6f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.4f, 19f, 9.05f, 19f, 11f)
                curveTo(19.04f, 11f, 19.07f, 11f, 19.1f, 11f)
                curveTo(18.36f, 11.07f, 17.65f, 11.23f, 17f, 11.5f)
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
                horizontalLineTo(13.03f)
                moveTo(19f, 13.5f)
                verticalLineTo(12f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 16.5f)
                verticalLineTo(15f)
                curveTo(20.38f, 15f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23f, 18.32f, 23f, 17.5f)
                curveTo(23f, 15.29f, 21.21f, 13.5f, 19f, 13.5f)
                moveTo(19f, 20f)
                curveTo(17.62f, 20f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15f, 16.68f, 15f, 17.5f)
                curveTo(15f, 19.71f, 16.79f, 21.5f, 19f, 21.5f)
                verticalLineTo(23f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 18.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _CloudSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSyncOutline: ImageVector? = null
