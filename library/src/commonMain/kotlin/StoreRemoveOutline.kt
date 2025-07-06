package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreRemoveOutline: ImageVector
    get() {
        if (_StoreRemoveOutline != null) {
            return _StoreRemoveOutline!!
        }
        _StoreRemoveOutline = ImageVector.Builder(
            name = "StoreRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(15.69f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(15.69f)
                curveTo(13.37f, 16.64f, 13f, 17.77f, 13f, 19f)
                curveTo(13f, 19.34f, 13.04f, 19.67f, 13.09f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(4f, 7f)
                horizontalLineTo(20f)
                lineTo(21f, 12f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13f, 19f, 13f)
                curveTo(17.77f, 13f, 16.64f, 13.37f, 15.69f, 14f)
                moveTo(12f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                moveTo(18.96f, 12f)
                lineTo(18.36f, 9f)
                horizontalLineTo(5.64f)
                lineTo(5.04f, 12f)
                horizontalLineTo(18.96f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _StoreRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreRemoveOutline: ImageVector? = null
