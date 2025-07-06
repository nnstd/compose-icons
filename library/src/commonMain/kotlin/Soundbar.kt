package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Soundbar: ImageVector
    get() {
        if (_Soundbar != null) {
            return _Soundbar!!
        }
        _Soundbar = ImageVector.Builder(
            name = "Soundbar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                curveTo(2.9f, 8f, 2f, 8.9f, 2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 15.11f, 2.9f, 16f, 4f, 16f)
                horizontalLineTo(20f)
                curveTo(21.11f, 16f, 22f, 15.11f, 22f, 14f)
                verticalLineTo(10f)
                curveTo(22f, 8.9f, 21.11f, 8f, 20f, 8f)
                moveTo(9f, 10f)
                curveTo(10.11f, 10f, 11f, 10.9f, 11f, 12f)
                curveTo(11f, 13.11f, 10.11f, 14f, 9f, 14f)
                curveTo(7.9f, 14f, 7f, 13.11f, 7f, 12f)
                curveTo(7f, 10.9f, 7.9f, 10f, 9f, 10f)
                moveTo(15f, 10f)
                curveTo(16.11f, 10f, 17f, 10.9f, 17f, 12f)
                curveTo(17f, 13.11f, 16.11f, 14f, 15f, 14f)
                curveTo(13.9f, 14f, 13f, 13.11f, 13f, 12f)
                curveTo(13f, 10.9f, 13.9f, 10f, 15f, 10f)
                moveTo(5f, 11f)
                curveTo(5.55f, 11f, 6f, 11.45f, 6f, 12f)
                curveTo(6f, 12.55f, 5.55f, 13f, 5f, 13f)
                curveTo(4.45f, 13f, 4f, 12.55f, 4f, 12f)
                curveTo(4f, 11.45f, 4.45f, 11f, 5f, 11f)
                moveTo(9f, 11f)
                curveTo(8.45f, 11f, 8f, 11.45f, 8f, 12f)
                curveTo(8f, 12.55f, 8.45f, 13f, 9f, 13f)
                curveTo(9.55f, 13f, 10f, 12.55f, 10f, 12f)
                curveTo(10f, 11.45f, 9.55f, 11f, 9f, 11f)
                moveTo(15f, 11f)
                curveTo(14.45f, 11f, 14f, 11.45f, 14f, 12f)
                curveTo(14f, 12.55f, 14.45f, 13f, 15f, 13f)
                curveTo(15.55f, 13f, 16f, 12.55f, 16f, 12f)
                curveTo(16f, 11.45f, 15.55f, 11f, 15f, 11f)
                moveTo(19f, 11f)
                curveTo(19.55f, 11f, 20f, 11.45f, 20f, 12f)
                curveTo(20f, 12.55f, 19.55f, 13f, 19f, 13f)
                curveTo(18.45f, 13f, 18f, 12.55f, 18f, 12f)
                curveTo(18f, 11.45f, 18.45f, 11f, 19f, 11f)
                close()
            }
        }.build()

        return _Soundbar!!
    }

@Suppress("ObjectPropertyName")
private var _Soundbar: ImageVector? = null
