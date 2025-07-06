package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Om: ImageVector
    get() {
        if (_Om != null) {
            return _Om!!
        }
        _Om = ImageVector.Builder(
            name = "Om",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                lineTo(13.5f, 3.5f)
                lineTo(15f, 5f)
                lineTo(16.5f, 3.5f)
                lineTo(15f, 2f)
                moveTo(11f, 3f)
                curveTo(10f, 9f, 17f, 10f, 20f, 6f)
                lineTo(18f, 4.5f)
                curveTo(17f, 6f, 13f, 8f, 11f, 3f)
                moveTo(9f, 7f)
                curveTo(7f, 7f, 4.5f, 8.5f, 4.5f, 8.5f)
                lineTo(6f, 11f)
                curveTo(7f, 10f, 9f, 9.5f, 10f, 10f)
                curveTo(12f, 11f, 9f, 13f, 7f, 12f)
                verticalLineTo(15.5f)
                curveTo(10f, 14f, 12f, 16f, 11f, 17.5f)
                curveTo(8f, 22f, 3f, 16f, 3f, 13f)
                curveTo(1f, 19f, 6f, 22f, 9f, 22f)
                curveTo(12f, 22f, 14f, 20f, 12.5f, 15f)
                horizontalLineTo(14f)
                curveTo(12.5f, 19.5f, 18f, 24f, 21f, 18f)
                curveTo(22f, 16f, 22f, 9.5f, 17f, 9.5f)
                curveTo(13f, 9.5f, 14f, 15f, 10.5f, 13.5f)
                curveTo(14f, 10f, 12f, 7f, 9f, 7f)
                moveTo(19f, 12f)
                curveTo(22f, 15f, 15f, 21f, 15f, 15f)
                curveTo(15f, 13f, 17f, 10.5f, 19f, 12f)
                close()
            }
        }.build()

        return _Om!!
    }

@Suppress("ObjectPropertyName")
private var _Om: ImageVector? = null
