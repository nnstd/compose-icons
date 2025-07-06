package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UploadLock: ImageVector
    get() {
        if (_UploadLock != null) {
            return _UploadLock!!
        }
        _UploadLock = ImageVector.Builder(
            name = "UploadLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(17f)
                curveTo(16.5f, 22f, 16f, 21.5f, 16f, 21f)
                verticalLineTo(17f)
                curveTo(16f, 16.5f, 16.5f, 16f, 17f, 16f)
                verticalLineTo(14.5f)
                curveTo(17f, 13.1f, 18.1f, 12f, 19.5f, 12f)
                curveTo(20.9f, 12f, 22f, 13.1f, 22f, 14.5f)
                verticalLineTo(16f)
                curveTo(22.5f, 16f, 23f, 16.5f, 23f, 17f)
                verticalLineTo(21f)
                curveTo(23f, 21.5f, 22.5f, 22f, 22f, 22f)
                moveTo(14f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                moveTo(21f, 16f)
                verticalLineTo(14.5f)
                curveTo(21f, 13.7f, 20.3f, 13f, 19.5f, 13f)
                curveTo(18.7f, 13f, 18f, 13.7f, 18f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                moveTo(15f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                lineTo(12f, 3f)
                lineTo(19f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _UploadLock!!
    }

@Suppress("ObjectPropertyName")
private var _UploadLock: ImageVector? = null
