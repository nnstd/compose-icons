package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertMinusOutline: ImageVector
    get() {
        if (_AlertMinusOutline != null) {
            return _AlertMinusOutline!!
        }
        _AlertMinusOutline = ImageVector.Builder(
            name = "AlertMinusOutline",
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
                moveTo(16f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(24f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _AlertMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlertMinusOutline: ImageVector? = null
