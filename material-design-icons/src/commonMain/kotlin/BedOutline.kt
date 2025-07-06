package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedOutline: ImageVector
    get() {
        if (_BedOutline != null) {
            return _BedOutline!!
        }
        _BedOutline = ImageVector.Builder(
            name = "BedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                curveTo(8.66f, 14f, 10f, 12.66f, 10f, 11f)
                curveTo(10f, 9.34f, 8.66f, 8f, 7f, 8f)
                curveTo(5.34f, 8f, 4f, 9.34f, 4f, 11f)
                curveTo(4f, 12.66f, 5.34f, 14f, 7f, 14f)
                moveTo(7f, 10f)
                curveTo(7.55f, 10f, 8f, 10.45f, 8f, 11f)
                curveTo(8f, 11.55f, 7.55f, 12f, 7f, 12f)
                curveTo(6.45f, 12f, 6f, 11.55f, 6f, 11f)
                curveTo(6f, 10.45f, 6.45f, 10f, 7f, 10f)
                moveTo(19f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                curveTo(23f, 8.79f, 21.21f, 7f, 19f, 7f)
                moveTo(21f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                curveTo(20.1f, 9f, 21f, 9.9f, 21f, 11f)
                close()
            }
        }.build()

        return _BedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BedOutline: ImageVector? = null
