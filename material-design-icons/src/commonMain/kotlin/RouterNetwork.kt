package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RouterNetwork: ImageVector
    get() {
        if (_RouterNetwork != null) {
            return _RouterNetwork!!
        }
        _RouterNetwork = ImageVector.Builder(
            name = "RouterNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                curveTo(3.9f, 9f, 3f, 9.9f, 3f, 11f)
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
                curveTo(15f, 19.45f, 14.55f, 19f, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                curveTo(20.11f, 17f, 21f, 16.11f, 21f, 15f)
                verticalLineTo(11f)
                curveTo(21f, 9.9f, 20.11f, 9f, 19f, 9f)
                horizontalLineTo(5f)
                moveTo(6f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(9.5f, 12f)
                horizontalLineTo(11.5f)
                verticalLineTo(14f)
                horizontalLineTo(9.5f)
                verticalLineTo(12f)
                moveTo(13f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _RouterNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _RouterNetwork: ImageVector? = null
