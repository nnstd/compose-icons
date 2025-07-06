package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CubeScan: ImageVector
    get() {
        if (_CubeScan != null) {
            return _CubeScan!!
        }
        _CubeScan = ImageVector.Builder(
            name = "CubeScan",
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
                moveTo(13f, 17.25f)
                lineTo(17f, 14.95f)
                verticalLineTo(10.36f)
                lineTo(13f, 12.66f)
                verticalLineTo(17.25f)
                moveTo(12f, 10.92f)
                lineTo(16f, 8.63f)
                lineTo(12f, 6.28f)
                lineTo(8f, 8.63f)
                lineTo(12f, 10.92f)
                moveTo(7f, 14.95f)
                lineTo(11f, 17.25f)
                verticalLineTo(12.66f)
                lineTo(7f, 10.36f)
                verticalLineTo(14.95f)
                moveTo(18.23f, 7.59f)
                curveTo(18.73f, 7.91f, 19f, 8.34f, 19f, 8.91f)
                verticalLineTo(15.23f)
                curveTo(19f, 15.8f, 18.73f, 16.23f, 18.23f, 16.55f)
                lineTo(12.75f, 19.73f)
                curveTo(12.25f, 20.05f, 11.75f, 20.05f, 11.25f, 19.73f)
                lineTo(5.77f, 16.55f)
                curveTo(5.27f, 16.23f, 5f, 15.8f, 5f, 15.23f)
                verticalLineTo(8.91f)
                curveTo(5f, 8.34f, 5.27f, 7.91f, 5.77f, 7.59f)
                lineTo(11.25f, 4.41f)
                curveTo(11.5f, 4.28f, 11.75f, 4.22f, 12f, 4.22f)
                curveTo(12.25f, 4.22f, 12.5f, 4.28f, 12.75f, 4.41f)
                lineTo(18.23f, 7.59f)
                close()
            }
        }.build()

        return _CubeScan!!
    }

@Suppress("ObjectPropertyName")
private var _CubeScan: ImageVector? = null
