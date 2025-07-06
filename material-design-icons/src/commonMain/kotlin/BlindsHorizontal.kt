package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BlindsHorizontal: ImageVector
    get() {
        if (_BlindsHorizontal != null) {
            return _BlindsHorizontal!!
        }
        _BlindsHorizontal = ImageVector.Builder(
            name = "BlindsHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(16f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                moveTo(14f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                moveTo(18f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(14f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                moveTo(6f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(14.82f)
                curveTo(13.55f, 15.14f, 13.25f, 15.66f, 13.25f, 16.25f)
                curveTo(13.25f, 17.22f, 14.03f, 18f, 15f, 18f)
                reflectiveCurveTo(16.75f, 17.22f, 16.75f, 16.25f)
                curveTo(16.75f, 15.66f, 16.45f, 15.13f, 16f, 14.82f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _BlindsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _BlindsHorizontal: ImageVector? = null
