package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BlindsOpen: ImageVector
    get() {
        if (_BlindsOpen != null) {
            return _BlindsOpen!!
        }
        _BlindsOpen = ImageVector.Builder(
            name = "BlindsOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2f)
                horizontalLineTo(21f)
                curveTo(21.55f, 2f, 22f, 2.45f, 22f, 3f)
                verticalLineTo(5f)
                curveTo(22f, 5.55f, 21.55f, 6f, 21f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                curveTo(20f, 7.55f, 19.55f, 8f, 19f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(10.17f)
                curveTo(14.17f, 10.58f, 15f, 11.7f, 15f, 13f)
                curveTo(15f, 14.66f, 13.66f, 16f, 12f, 16f)
                curveTo(10.34f, 16f, 9f, 14.66f, 9f, 13f)
                curveTo(9f, 11.69f, 9.84f, 10.58f, 11f, 10.17f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                curveTo(4.45f, 8f, 4f, 7.55f, 4f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                curveTo(2.45f, 6f, 2f, 5.55f, 2f, 5f)
                verticalLineTo(3f)
                curveTo(2f, 2.45f, 2.45f, 2f, 3f, 2f)
                moveTo(12f, 12f)
                curveTo(11.45f, 12f, 11f, 12.45f, 11f, 13f)
                curveTo(11f, 13.55f, 11.45f, 14f, 12f, 14f)
                curveTo(12.55f, 14f, 13f, 13.55f, 13f, 13f)
                curveTo(13f, 12.45f, 12.55f, 12f, 12f, 12f)
                close()
            }
        }.build()

        return _BlindsOpen!!
    }

@Suppress("ObjectPropertyName")
private var _BlindsOpen: ImageVector? = null
