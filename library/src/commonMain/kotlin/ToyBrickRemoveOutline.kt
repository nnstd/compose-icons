package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToyBrickRemoveOutline: ImageVector
    get() {
        if (_ToyBrickRemoveOutline != null) {
            return _ToyBrickRemoveOutline!!
        }
        _ToyBrickRemoveOutline = ImageVector.Builder(
            name = "ToyBrickRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                verticalLineTo(5f)
                curveTo(19f, 3.9f, 18.1f, 3f, 17f, 3f)
                horizontalLineTo(15f)
                curveTo(13.9f, 3f, 13f, 3.9f, 13f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                curveTo(11f, 3.9f, 10.1f, 3f, 9f, 3f)
                horizontalLineTo(7f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                moveTo(17.88f, 15.46f)
                lineTo(20f, 17.59f)
                lineTo(22.12f, 15.47f)
                lineTo(23.54f, 16.88f)
                lineTo(21.41f, 19f)
                lineTo(23.54f, 21.12f)
                lineTo(22.12f, 22.54f)
                lineTo(20f, 20.41f)
                lineTo(17.88f, 22.54f)
                lineTo(16.46f, 21.12f)
                lineTo(18.59f, 19f)
                lineTo(16.47f, 16.88f)
            }
        }.build()

        return _ToyBrickRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrickRemoveOutline: ImageVector? = null
