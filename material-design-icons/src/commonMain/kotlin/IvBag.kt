package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IvBag: ImageVector
    get() {
        if (_IvBag != null) {
            return _IvBag!!
        }
        _IvBag = ImageVector.Builder(
            name = "IvBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 1f)
                horizontalLineTo(10f)
                curveTo(5f, 1f, 5f, 3f, 5f, 3f)
                verticalLineTo(15f)
                curveTo(5f, 15f, 5f, 17f, 10f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                curveTo(11f, 21.21f, 11.8f, 23f, 14f, 23f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                curveTo(13.19f, 21f, 13f, 20.45f, 13f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                curveTo(19f, 17f, 19f, 15f, 19f, 15f)
                verticalLineTo(3f)
                curveTo(19f, 3f, 19f, 1f, 14f, 1f)
                moveTo(17f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                moveTo(17f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(3.5f)
                curveTo(7.3f, 3.32f, 8.13f, 3f, 10f, 3f)
                horizontalLineTo(14f)
                curveTo(15.88f, 3f, 16.7f, 3.32f, 17f, 3.5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _IvBag!!
    }

@Suppress("ObjectPropertyName")
private var _IvBag: ImageVector? = null
