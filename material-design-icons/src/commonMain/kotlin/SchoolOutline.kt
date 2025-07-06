package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SchoolOutline: ImageVector
    get() {
        if (_SchoolOutline != null) {
            return _SchoolOutline!!
        }
        _SchoolOutline = ImageVector.Builder(
            name = "SchoolOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(1f, 9f)
                lineTo(5f, 11.18f)
                verticalLineTo(17.18f)
                lineTo(12f, 21f)
                lineTo(19f, 17.18f)
                verticalLineTo(11.18f)
                lineTo(21f, 10.09f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                lineTo(12f, 3f)
                moveTo(18.82f, 9f)
                lineTo(12f, 12.72f)
                lineTo(5.18f, 9f)
                lineTo(12f, 5.28f)
                lineTo(18.82f, 9f)
                moveTo(17f, 16f)
                lineTo(12f, 18.72f)
                lineTo(7f, 16f)
                verticalLineTo(12.27f)
                lineTo(12f, 15f)
                lineTo(17f, 12.27f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _SchoolOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SchoolOutline: ImageVector? = null
