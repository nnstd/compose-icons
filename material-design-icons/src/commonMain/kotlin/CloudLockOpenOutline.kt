package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudLockOpenOutline: ImageVector
    get() {
        if (_CloudLockOpenOutline != null) {
            return _CloudLockOpenOutline!!
        }
        _CloudLockOpenOutline = ImageVector.Builder(
            name = "CloudLockOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(6.5f)
                curveTo(5f, 20f, 3.69f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1f, 16.09f, 1f, 14.58f)
                curveTo(1f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                reflectiveCurveTo(4f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                reflectiveCurveTo(10.42f, 4f, 12f, 4f)
                curveTo(13.95f, 4f, 15.6f, 4.68f, 16.96f, 6.04f)
                curveTo(17.84f, 6.91f, 18.42f, 7.91f, 18.74f, 9.03f)
                curveTo(18.03f, 9.06f, 17.37f, 9.25f, 16.78f, 9.56f)
                curveTo(16.55f, 8.78f, 16.15f, 8.08f, 15.54f, 7.46f)
                curveTo(14.56f, 6.5f, 13.38f, 6f, 12f, 6f)
                reflectiveCurveTo(9.44f, 6.5f, 8.46f, 7.46f)
                curveTo(7.5f, 8.44f, 7f, 9.62f, 7f, 11f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 11f, 4.71f, 11.34f, 4.03f, 12.03f)
                curveTo(3.34f, 12.71f, 3f, 13.53f, 3f, 14.5f)
                reflectiveCurveTo(3.34f, 16.29f, 4.03f, 17f)
                curveTo(4.71f, 17.66f, 5.53f, 18f, 6.5f, 18f)
                moveTo(21.8f, 16f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(21.8f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11f, 19f, 11f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(16f)
                curveTo(15.6f, 16f, 15f, 16.6f, 15f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15f, 21.4f, 15.6f, 22f, 16.2f, 22f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22f, 23f, 21.4f, 23f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23f, 16.6f, 22.4f, 16f, 21.8f, 16f)
                close()
            }
        }.build()

        return _CloudLockOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLockOpenOutline: ImageVector? = null
