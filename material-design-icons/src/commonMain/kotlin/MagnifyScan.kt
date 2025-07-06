package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyScan: ImageVector
    get() {
        if (_MagnifyScan != null) {
            return _MagnifyScan!!
        }
        _MagnifyScan = ImageVector.Builder(
            name = "MagnifyScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(20.5f)
                curveTo(22f, 20.89f, 21.84f, 21.24f, 21.54f, 21.54f)
                curveTo(21.24f, 21.84f, 20.89f, 22f, 20.5f, 22f)
                horizontalLineTo(17f)
                moveTo(7f, 22f)
                horizontalLineTo(3.5f)
                curveTo(3.11f, 22f, 2.76f, 21.84f, 2.46f, 21.54f)
                curveTo(2.16f, 21.24f, 2f, 20.89f, 2f, 20.5f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(17f, 2f)
                horizontalLineTo(20.5f)
                curveTo(20.89f, 2f, 21.24f, 2.16f, 21.54f, 2.46f)
                curveTo(21.84f, 2.76f, 22f, 3.11f, 22f, 3.5f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                moveTo(7f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 3.11f, 2.16f, 2.76f, 2.46f, 2.46f)
                curveTo(2.76f, 2.16f, 3.11f, 2f, 3.5f, 2f)
                horizontalLineTo(7f)
                moveTo(10.5f, 6f)
                curveTo(13f, 6f, 15f, 8f, 15f, 10.5f)
                curveTo(15f, 11.38f, 14.75f, 12.2f, 14.31f, 12.9f)
                lineTo(17.57f, 16.16f)
                lineTo(16.16f, 17.57f)
                lineTo(12.9f, 14.31f)
                curveTo(12.2f, 14.75f, 11.38f, 15f, 10.5f, 15f)
                curveTo(8f, 15f, 6f, 13f, 6f, 10.5f)
                curveTo(6f, 8f, 8f, 6f, 10.5f, 6f)
                moveTo(10.5f, 8f)
                curveTo(9.12f, 8f, 8f, 9.12f, 8f, 10.5f)
                curveTo(8f, 11.88f, 9.12f, 13f, 10.5f, 13f)
                curveTo(11.88f, 13f, 13f, 11.88f, 13f, 10.5f)
                curveTo(13f, 9.12f, 11.88f, 8f, 10.5f, 8f)
                close()
            }
        }.build()

        return _MagnifyScan!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyScan: ImageVector? = null
