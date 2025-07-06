package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeRemoveOutline: ImageVector
    get() {
        if (_HomeRemoveOutline != null) {
            return _HomeRemoveOutline!!
        }
        _HomeRemoveOutline = ImageVector.Builder(
            name = "HomeRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.47f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 15.88f)
                moveTo(5f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(10.19f)
                lineTo(12f, 5.69f)
                lineTo(7f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                curveTo(12f, 18.7f, 12.12f, 19.37f, 12.34f, 20f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _HomeRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeRemoveOutline: ImageVector? = null
