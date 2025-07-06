package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BlindsHorizontalClosed: ImageVector
    get() {
        if (_BlindsHorizontalClosed != null) {
            return _BlindsHorizontalClosed!!
        }
        _BlindsHorizontalClosed = ImageVector.Builder(
            name = "BlindsHorizontalClosed",
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
                horizontalLineTo(13.25f)
                curveTo(13.25f, 21.97f, 14.03f, 22.75f, 15f, 22.75f)
                reflectiveCurveTo(16.75f, 21.97f, 16.75f, 21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(18f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(14f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                moveTo(14f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                moveTo(16f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
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
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                moveTo(16f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _BlindsHorizontalClosed!!
    }

@Suppress("ObjectPropertyName")
private var _BlindsHorizontalClosed: ImageVector? = null
