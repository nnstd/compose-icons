package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreRemove: ImageVector
    get() {
        if (_StoreRemove != null) {
            return _StoreRemove!!
        }
        _StoreRemove = ImageVector.Builder(
            name = "StoreRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(15.46f, 16.88f)
                lineTo(16.88f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 16.88f)
                moveTo(4f, 7f)
                horizontalLineTo(20f)
                lineTo(21f, 12f)
                verticalLineTo(13.34f)
                curveTo(20.33f, 13.09f, 19.62f, 12.96f, 18.91f, 12.96f)
                curveTo(17.71f, 12.96f, 16.54f, 13.33f, 15.54f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(15.53f)
                curveTo(13.3f, 16.53f, 12.92f, 17.73f, 12.92f, 18.95f)
                lineTo(13f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(4f, 7f)
                moveTo(6f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _StoreRemove!!
    }

@Suppress("ObjectPropertyName")
private var _StoreRemove: ImageVector? = null
