package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraLockOutline: ImageVector
    get() {
        if (_CameraLockOutline != null) {
            return _CameraLockOutline!!
        }
        _CameraLockOutline = ImageVector.Builder(
            name = "CameraLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(23f, 22.4f, 22.4f, 23f, 21.7f, 23f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 23f, 15f, 22.4f, 15f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(15f, 17.6f, 15.6f, 17f, 16.2f, 17f)
                verticalLineTo(15.5f)
                curveTo(16.2f, 14.1f, 17.6f, 13f, 19f, 13f)
                curveTo(20.4f, 13f, 21.8f, 14.1f, 21.8f, 15.5f)
                verticalLineTo(17f)
                curveTo(22.4f, 17f, 23f, 17.6f, 23f, 18.3f)
                moveTo(20.5f, 15.5f)
                curveTo(20.5f, 14.7f, 19.8f, 14.2f, 19f, 14.2f)
                curveTo(18.2f, 14.2f, 17.5f, 14.7f, 17.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.5f)
                moveTo(20f, 4f)
                curveTo(21.1f, 4f, 22f, 4.9f, 22f, 6f)
                verticalLineTo(12f)
                curveTo(21.42f, 11.56f, 20.74f, 11.25f, 20f, 11.1f)
                verticalLineTo(6f)
                horizontalLineTo(15.95f)
                lineTo(14.12f, 4f)
                horizontalLineTo(9.88f)
                lineTo(8.05f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.9f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(7.17f)
                lineTo(9f, 2f)
                horizontalLineTo(15f)
                lineTo(16.83f, 4f)
                horizontalLineTo(20f)
                moveTo(12f, 7f)
                curveTo(14.57f, 7f, 16.68f, 8.94f, 16.97f, 11.43f)
                curveTo(15.29f, 12.18f, 14.1f, 13.83f, 14f, 15.76f)
                curveTo(13.67f, 16.06f, 13.4f, 16.43f, 13.23f, 16.85f)
                curveTo(12.84f, 16.95f, 12.42f, 17f, 12f, 17f)
                curveTo(9.24f, 17f, 7f, 14.76f, 7f, 12f)
                curveTo(7f, 9.24f, 9.24f, 7f, 12f, 7f)
                moveTo(12f, 15f)
                curveTo(13.65f, 15f, 15f, 13.65f, 15f, 12f)
                curveTo(15f, 10.35f, 13.65f, 9f, 12f, 9f)
                curveTo(10.35f, 9f, 9f, 10.35f, 9f, 12f)
                curveTo(9f, 13.65f, 10.35f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _CameraLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraLockOutline: ImageVector? = null
