package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookCheckOutline: ImageVector
    get() {
        if (_BookCheckOutline != null) {
            return _BookCheckOutline!!
        }
        _BookCheckOutline = ImageVector.Builder(
            name = "BookCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 22.16f)
                lineTo(14f, 19.16f)
                lineTo(15.16f, 18f)
                lineTo(16.75f, 19.59f)
                lineTo(20.34f, 16f)
                lineTo(21.5f, 17.41f)
                lineTo(16.75f, 22.16f)
                moveTo(18f, 2f)
                curveTo(19.1f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(13.34f)
                curveTo(19.37f, 13.12f, 18.7f, 13f, 18f, 13f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 20.72f, 12.45f, 21.39f, 12.8f, 22f)
                horizontalLineTo(6f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _BookCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookCheckOutline: ImageVector? = null
