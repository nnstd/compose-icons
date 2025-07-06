package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeGroupPlus: ImageVector
    get() {
        if (_HomeGroupPlus != null) {
            return _HomeGroupPlus!!
        }
        _HomeGroupPlus = ImageVector.Builder(
            name = "HomeGroupPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                horizontalLineTo(1f)
                lineTo(5f, 2f)
                lineTo(9f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                moveTo(13f, 10.9f)
                lineTo(14.3f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                lineTo(17f, 3f)
                lineTo(12f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(10.9f)
                moveTo(13.8f, 22f)
                curveTo(13.3f, 21.1f, 13f, 20.1f, 13f, 19f)
                curveTo(13f, 17.4f, 13.6f, 15.9f, 14.7f, 14.9f)
                lineTo(9f, 10f)
                lineTo(2f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(13.8f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _HomeGroupPlus!!
    }

@Suppress("ObjectPropertyName")
private var _HomeGroupPlus: ImageVector? = null
