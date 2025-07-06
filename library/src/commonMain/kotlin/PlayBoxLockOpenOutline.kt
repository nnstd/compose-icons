package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlayBoxLockOpenOutline: ImageVector
    get() {
        if (_PlayBoxLockOpenOutline != null) {
            return _PlayBoxLockOpenOutline!!
        }
        _PlayBoxLockOpenOutline = ImageVector.Builder(
            name = "PlayBoxLockOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23f, 21.4f, 22.4f, 22f, 21.7f, 22f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22f, 15f, 21.4f, 15f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15f, 16.6f, 15.6f, 16f, 16.2f, 16f)
                verticalLineTo(13.5f)
                curveTo(16.2f, 12.1f, 17.6f, 11f, 19f, 11f)
                curveTo(20.4f, 11f, 21.8f, 12.1f, 21.8f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(20.5f)
                verticalLineTo(13.5f)
                curveTo(20.5f, 12.7f, 19.8f, 12.2f, 19f, 12.2f)
                curveTo(18.2f, 12.2f, 17.5f, 12.7f, 17.5f, 13.5f)
                verticalLineTo(16f)
                horizontalLineTo(21.8f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(18f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(5f)
                curveTo(2f, 3.89f, 2.89f, 3f, 4f, 3f)
                horizontalLineTo(18f)
                curveTo(19.1f, 3f, 20f, 3.89f, 20f, 5f)
                verticalLineTo(9.1f)
                lineTo(19f, 9f)
                lineTo(18f, 9.1f)
                verticalLineTo(5f)
                moveTo(9f, 8f)
                lineTo(14f, 12f)
                lineTo(9f, 16f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _PlayBoxLockOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PlayBoxLockOpenOutline: ImageVector? = null
