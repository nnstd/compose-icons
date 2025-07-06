package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SimOutline: ImageVector
    get() {
        if (_SimOutline != null) {
            return _SimOutline!!
        }
        _SimOutline = ImageVector.Builder(
            name = "SimOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(8.8f)
                lineTo(10.8f, 4f)
                horizontalLineTo(18f)
                moveTo(18f, 2f)
                horizontalLineTo(10f)
                lineTo(4f, 8f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                moveTo(9.5f, 19f)
                horizontalLineTo(7.5f)
                verticalLineTo(17f)
                horizontalLineTo(9.5f)
                verticalLineTo(19f)
                moveTo(16.5f, 19f)
                horizontalLineTo(14.5f)
                verticalLineTo(17f)
                horizontalLineTo(16.5f)
                verticalLineTo(19f)
                moveTo(9.5f, 15f)
                horizontalLineTo(7.5f)
                verticalLineTo(11f)
                horizontalLineTo(9.5f)
                verticalLineTo(15f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(13f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                moveTo(16.5f, 15f)
                horizontalLineTo(14.5f)
                verticalLineTo(11f)
                horizontalLineTo(16.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _SimOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SimOutline: ImageVector? = null
