package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BeakerRemoveOutline: ImageVector
    get() {
        if (_BeakerRemoveOutline != null) {
            return _BeakerRemoveOutline!!
        }
        _BeakerRemoveOutline = ImageVector.Builder(
            name = "BeakerRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.46f, 15.88f)
                lineTo(16.88f, 14.46f)
                lineTo(19f, 16.59f)
                lineTo(21.12f, 14.47f)
                lineTo(22.53f, 15.88f)
                lineTo(20.41f, 18f)
                lineTo(22.54f, 20.12f)
                lineTo(21.12f, 21.54f)
                lineTo(19f, 19.41f)
                lineTo(16.88f, 21.53f)
                lineTo(15.47f, 20.12f)
                lineTo(17.59f, 18f)
                lineTo(15.46f, 15.88f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(19.9f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(12f)
                curveTo(18.3f, 12f, 17.63f, 12.12f, 17f, 12.34f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(13.08f)
                curveTo(13.2f, 19.72f, 13.45f, 20.39f, 13.8f, 21f)
                horizontalLineTo(7f)
                curveTo(5.9f, 21f, 5f, 20.11f, 5f, 19f)
                verticalLineTo(7f)
                curveTo(5f, 5.9f, 4.11f, 5f, 3f, 5f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _BeakerRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerRemoveOutline: ImageVector? = null
