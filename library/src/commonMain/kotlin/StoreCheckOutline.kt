package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreCheckOutline: ImageVector
    get() {
        if (_StoreCheckOutline != null) {
            return _StoreCheckOutline!!
        }
        _StoreCheckOutline = ImageVector.Builder(
            name = "StoreCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                curveTo(19.7f, 13f, 20.37f, 13.13f, 21f, 13.35f)
                verticalLineTo(12f)
                lineTo(20f, 7f)
                horizontalLineTo(4f)
                lineTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13f, 19.34f, 13f, 19f)
                curveTo(13f, 17.77f, 13.37f, 16.64f, 14f, 15.69f)
                verticalLineTo(14f)
                horizontalLineTo(15.69f)
                curveTo(16.64f, 13.37f, 17.77f, 13f, 19f, 13f)
                moveTo(12f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                moveTo(5.04f, 12f)
                lineTo(5.64f, 9f)
                horizontalLineTo(18.36f)
                lineTo(18.96f, 12f)
                horizontalLineTo(5.04f)
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(22.5f, 17.25f)
                lineTo(17.75f, 22f)
                lineTo(15f, 19f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
            }
        }.build()

        return _StoreCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreCheckOutline: ImageVector? = null
