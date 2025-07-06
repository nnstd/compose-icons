package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertRemoveOutline: ImageVector
    get() {
        if (_AlertRemoveOutline != null) {
            return _AlertRemoveOutline!!
        }
        _AlertRemoveOutline = ImageVector.Builder(
            name = "AlertRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15.5f)
                horizontalLineTo(13f)
                verticalLineTo(17.5f)
                horizontalLineTo(11f)
                verticalLineTo(15.5f)
                moveTo(14f, 19f)
                curveTo(14f, 18.86f, 14f, 18.73f, 14f, 18.6f)
                horizontalLineTo(5.4f)
                lineTo(12f, 7.3f)
                lineTo(16.11f, 14.44f)
                curveTo(16.62f, 14f, 17.2f, 13.65f, 17.84f, 13.41f)
                lineTo(12f, 3.3f)
                lineTo(2f, 20.6f)
                horizontalLineTo(14.22f)
                curveTo(14.08f, 20.09f, 14f, 19.56f, 14f, 19f)
                moveTo(13f, 10.5f)
                horizontalLineTo(11f)
                verticalLineTo(14.5f)
                horizontalLineTo(13f)
                verticalLineTo(10.5f)
                moveTo(22.12f, 15.46f)
                lineTo(20f, 17.59f)
                lineTo(17.88f, 15.46f)
                lineTo(16.47f, 16.88f)
                lineTo(18.59f, 19f)
                lineTo(16.47f, 21.12f)
                lineTo(17.88f, 22.54f)
                lineTo(20f, 20.41f)
                lineTo(22.12f, 22.54f)
                lineTo(23.54f, 21.12f)
                lineTo(21.41f, 19f)
                lineTo(23.54f, 16.88f)
                lineTo(22.12f, 15.46f)
                close()
            }
        }.build()

        return _AlertRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlertRemoveOutline: ImageVector? = null
