package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlayBoxLock: ImageVector
    get() {
        if (_PlayBoxLock != null) {
            return _PlayBoxLock!!
        }
        _PlayBoxLock = ImageVector.Builder(
            name = "PlayBoxLock",
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
                verticalLineTo(14.5f)
                curveTo(16.2f, 13.1f, 17.6f, 12f, 19f, 12f)
                curveTo(20.4f, 12f, 21.8f, 13.1f, 21.8f, 14.5f)
                verticalLineTo(16f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(13f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(5f)
                curveTo(2f, 3.89f, 2.89f, 3f, 4f, 3f)
                horizontalLineTo(18f)
                curveTo(19.1f, 3f, 20f, 3.89f, 20f, 5f)
                verticalLineTo(10.1f)
                lineTo(19f, 10f)
                lineTo(18f, 10.1f)
                curveTo(15.79f, 10.55f, 14.12f, 12.45f, 14f, 14.76f)
                curveTo(13.39f, 15.31f, 13f, 16.11f, 13f, 17f)
                verticalLineTo(19f)
                moveTo(20.5f, 14.5f)
                curveTo(20.5f, 13.7f, 19.8f, 13.2f, 19f, 13.2f)
                curveTo(18.2f, 13.2f, 17.5f, 13.7f, 17.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.5f)
                moveTo(9f, 8f)
                verticalLineTo(16f)
                lineTo(14f, 12f)
                lineTo(9f, 8f)
                close()
            }
        }.build()

        return _PlayBoxLock!!
    }

@Suppress("ObjectPropertyName")
private var _PlayBoxLock: ImageVector? = null
