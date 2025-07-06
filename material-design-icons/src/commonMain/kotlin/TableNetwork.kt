package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableNetwork: ImageVector
    get() {
        if (_TableNetwork != null) {
            return _TableNetwork!!
        }
        _TableNetwork = ImageVector.Builder(
            name = "TableNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                curveTo(15f, 19.45f, 14.55f, 19f, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                curveTo(20.11f, 17f, 21f, 16.11f, 21f, 15f)
                verticalLineTo(3f)
                curveTo(21f, 1.9f, 20.11f, 1f, 19f, 1f)
                horizontalLineTo(5f)
                curveTo(3.9f, 1f, 3f, 1.9f, 3f, 3f)
                verticalLineTo(15f)
                curveTo(3f, 16.11f, 3.9f, 17f, 5f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                curveTo(9.45f, 19f, 9f, 19.45f, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                curveTo(9f, 22.55f, 9.45f, 23f, 10f, 23f)
                horizontalLineTo(14f)
                curveTo(14.55f, 23f, 15f, 22.55f, 15f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                moveTo(13f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(13f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(5f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(5f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _TableNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _TableNetwork: ImageVector? = null
