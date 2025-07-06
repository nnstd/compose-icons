package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarCheck: ImageVector
    get() {
        if (_StarCheck != null) {
            return _StarCheck!!
        }
        _StarCheck = ImageVector.Builder(
            name = "StarCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.8f, 21f)
                lineTo(7.4f, 14f)
                lineTo(2f, 9.2f)
                lineTo(9.2f, 8.6f)
                lineTo(12f, 2f)
                lineTo(14.8f, 8.6f)
                lineTo(22f, 9.2f)
                lineTo(18.8f, 12f)
                horizontalLineTo(18f)
                curveTo(14.9f, 12f, 12.4f, 14.3f, 12f, 17.3f)
                lineTo(5.8f, 21f)
                moveTo(17.8f, 21.2f)
                lineTo(22.6f, 16.4f)
                lineTo(21.3f, 15f)
                lineTo(17.7f, 18.6f)
                lineTo(16.2f, 17f)
                lineTo(15f, 18.2f)
                lineTo(17.8f, 21.2f)
            }
        }.build()

        return _StarCheck!!
    }

@Suppress("ObjectPropertyName")
private var _StarCheck: ImageVector? = null
