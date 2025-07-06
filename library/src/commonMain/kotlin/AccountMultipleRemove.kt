package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountMultipleRemove: ImageVector
    get() {
        if (_AccountMultipleRemove != null) {
            return _AccountMultipleRemove!!
        }
        _AccountMultipleRemove = ImageVector.Builder(
            name = "AccountMultipleRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                curveTo(21f, 15.45f, 20.3f, 14.06f, 19.18f, 13.06f)
                curveTo(24f, 13.55f, 24f, 17f, 24f, 17f)
                moveTo(18f, 5f)
                curveTo(19.66f, 5f, 21f, 6.34f, 21f, 8f)
                curveTo(21f, 9.66f, 19.66f, 11f, 18f, 11f)
                curveTo(17.69f, 11f, 17.38f, 10.95f, 17.1f, 10.86f)
                curveTo(17.67f, 10.05f, 18f, 9.07f, 18f, 8f)
                curveTo(18f, 6.94f, 17.67f, 5.95f, 17.1f, 5.14f)
                curveTo(17.38f, 5.05f, 17.69f, 5f, 18f, 5f)
                moveTo(13f, 5f)
                curveTo(14.66f, 5f, 16f, 6.34f, 16f, 8f)
                curveTo(16f, 9.66f, 14.66f, 11f, 13f, 11f)
                curveTo(11.34f, 11f, 10f, 9.66f, 10f, 8f)
                curveTo(10f, 6.34f, 11.34f, 5f, 13f, 5f)
                moveTo(19f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                curveTo(7f, 14.79f, 9.69f, 13f, 13f, 13f)
                curveTo(16.31f, 13f, 19f, 14.79f, 19f, 17f)
                moveTo(0.464f, 13.12f)
                lineTo(2.59f, 11f)
                lineTo(0.464f, 8.88f)
                lineTo(1.88f, 7.46f)
                lineTo(4f, 9.59f)
                lineTo(6.12f, 7.46f)
                lineTo(7.54f, 8.88f)
                lineTo(5.41f, 11f)
                lineTo(7.54f, 13.12f)
                lineTo(6.12f, 14.54f)
                lineTo(4f, 12.41f)
                lineTo(1.88f, 14.54f)
                close()
            }
        }.build()

        return _AccountMultipleRemove!!
    }

@Suppress("ObjectPropertyName")
private var _AccountMultipleRemove: ImageVector? = null
