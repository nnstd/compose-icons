package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerRemoveVariant: ImageVector
    get() {
        if (_MapMarkerRemoveVariant != null) {
            return _MapMarkerRemoveVariant!!
        }
        _MapMarkerRemoveVariant = ImageVector.Builder(
            name = "MapMarkerRemoveVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                curveTo(5f, 14.25f, 12f, 22f, 12f, 22f)
                curveTo(12f, 22f, 19f, 14.25f, 19f, 9f)
                curveTo(19f, 5.14f, 15.86f, 2f, 12f, 2f)
                moveTo(9.59f, 5.17f)
                lineTo(12f, 7.58f)
                lineTo(14.41f, 5.17f)
                lineTo(15.83f, 6.58f)
                lineTo(13.41f, 9f)
                lineTo(15.83f, 11.41f)
                lineTo(14.41f, 12.83f)
                lineTo(12f, 10.41f)
                lineTo(9.59f, 12.83f)
                lineTo(8.17f, 11.41f)
                lineTo(10.59f, 9f)
                lineTo(8.17f, 6.58f)
            }
        }.build()

        return _MapMarkerRemoveVariant!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerRemoveVariant: ImageVector? = null
