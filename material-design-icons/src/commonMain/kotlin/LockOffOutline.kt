package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockOffOutline: ImageVector
    get() {
        if (_LockOffOutline != null) {
            return _LockOffOutline!!
        }
        _LockOffOutline = ImageVector.Builder(
            name = "LockOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5.82f)
                lineTo(7.36f, 4.16f)
                curveTo(8.09f, 2.31f, 9.89f, 1f, 12f, 1f)
                curveTo(14.76f, 1f, 17f, 3.24f, 17f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                curveTo(19.11f, 8f, 20f, 8.9f, 20f, 10f)
                verticalLineTo(16.8f)
                lineTo(18f, 14.8f)
                verticalLineTo(10f)
                horizontalLineTo(13.2f)
                lineTo(11.2f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                curveTo(15f, 4.34f, 13.66f, 3f, 12f, 3f)
                curveTo(10.41f, 3f, 9.11f, 4.25f, 9f, 5.82f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.46f, 21.35f)
                curveTo(19.1f, 21.75f, 18.58f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(10f)
                curveTo(4f, 8.89f, 4.89f, 8f, 6f, 8f)
                horizontalLineTo(6.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(18f, 19.89f)
                lineTo(13.85f, 15.74f)
                curveTo(13.56f, 16.5f, 12.84f, 17f, 12f, 17f)
                curveTo(10.89f, 17f, 10f, 16.1f, 10f, 15f)
                curveTo(10f, 14.15f, 10.5f, 13.44f, 11.26f, 13.15f)
                lineTo(8.11f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(19.89f)
                close()
            }
        }.build()

        return _LockOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LockOffOutline: ImageVector? = null
