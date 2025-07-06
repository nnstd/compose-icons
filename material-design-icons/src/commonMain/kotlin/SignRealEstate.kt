package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignRealEstate: ImageVector
    get() {
        if (_SignRealEstate != null) {
            return _SignRealEstate!!
        }
        _SignRealEstate = ImageVector.Builder(
            name = "SignRealEstate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(8f)
                curveTo(6.9f, 8f, 6f, 8.9f, 6f, 10f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.9f, 18f, 8f, 18f)
                horizontalLineTo(18f)
                curveTo(19.11f, 18f, 20f, 17.11f, 20f, 16f)
                verticalLineTo(10f)
                curveTo(20f, 8.9f, 19.11f, 8f, 18f, 8f)
                moveTo(14f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                moveTo(18f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                moveTo(22f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _SignRealEstate!!
    }

@Suppress("ObjectPropertyName")
private var _SignRealEstate: ImageVector? = null
