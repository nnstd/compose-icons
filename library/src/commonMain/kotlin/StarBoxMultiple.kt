package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarBoxMultiple: ImageVector
    get() {
        if (_StarBoxMultiple != null) {
            return _StarBoxMultiple!!
        }
        _StarBoxMultiple = ImageVector.Builder(
            name = "StarBoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                curveTo(2.4f, 22f, 2f, 21.6f, 2f, 21f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(8f, 2f)
                horizontalLineTo(20f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 17.11f, 21.11f, 18f, 20f, 18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(4f)
                curveTo(6f, 2.9f, 6.9f, 2f, 8f, 2f)
                moveTo(16.3f, 13.3f)
                lineTo(15.9f, 10.7f)
                lineTo(17.8f, 8.8f)
                lineTo(15.2f, 8.4f)
                lineTo(14f, 6f)
                lineTo(12.8f, 8.4f)
                lineTo(10.2f, 8.8f)
                lineTo(12.1f, 10.6f)
                lineTo(11.6f, 13.2f)
                lineTo(14f, 12f)
                lineTo(16.3f, 13.3f)
                close()
            }
        }.build()

        return _StarBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _StarBoxMultiple: ImageVector? = null
