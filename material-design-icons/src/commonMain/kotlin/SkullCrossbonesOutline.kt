package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkullCrossbonesOutline: ImageVector
    get() {
        if (_SkullCrossbonesOutline != null) {
            return _SkullCrossbonesOutline!!
        }
        _SkullCrossbonesOutline = ImageVector.Builder(
            name = "SkullCrossbonesOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.8f, 18.5f)
                lineTo(21.8f, 20.1f)
                lineTo(21.4f, 22f)
                lineTo(12f, 19.5f)
                lineTo(2.6f, 22f)
                lineTo(2.1f, 20.1f)
                lineTo(8.1f, 18.5f)
                lineTo(2f, 16.9f)
                lineTo(2.5f, 15f)
                lineTo(11.9f, 17.5f)
                lineTo(21.3f, 15f)
                lineTo(21.8f, 16.9f)
                lineTo(15.8f, 18.5f)
                moveTo(9.5f, 6f)
                curveTo(8.7f, 6f, 8f, 6.7f, 8f, 7.5f)
                curveTo(8f, 8.3f, 8.7f, 9f, 9.5f, 9f)
                curveTo(10.3f, 9f, 11f, 8.3f, 11f, 7.5f)
                curveTo(11f, 6.7f, 10.3f, 6f, 9.5f, 6f)
                moveTo(14.5f, 6f)
                curveTo(13.7f, 6f, 13f, 6.7f, 13f, 7.5f)
                curveTo(13f, 8.3f, 13.7f, 9f, 14.5f, 9f)
                curveTo(15.3f, 9f, 16f, 8.3f, 16f, 7.5f)
                curveTo(16f, 6.7f, 15.3f, 6f, 14.5f, 6f)
                moveTo(13f, 11f)
                lineTo(12f, 9f)
                lineTo(11f, 11f)
                horizontalLineTo(13f)
                moveTo(12f, 1f)
                curveTo(8.1f, 1f, 5f, 4.1f, 5f, 8f)
                curveTo(5f, 9.9f, 5.8f, 11.6f, 7f, 12.9f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(12.9f)
                curveTo(18.2f, 11.6f, 19f, 9.9f, 19f, 8f)
                curveTo(19f, 4.1f, 15.9f, 1f, 12f, 1f)
                moveTo(15f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                curveTo(7.8f, 11.1f, 7f, 9.7f, 7f, 8f)
                curveTo(7f, 5.2f, 9.2f, 3f, 12f, 3f)
                curveTo(14.8f, 3f, 17f, 5.2f, 17f, 8f)
                curveTo(17f, 9.6f, 16.2f, 11.1f, 15f, 12f)
                close()
            }
        }.build()

        return _SkullCrossbonesOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkullCrossbonesOutline: ImageVector? = null
