package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeMinus: ImageVector
    get() {
        if (_HomeMinus != null) {
            return _HomeMinus!!
        }
        _HomeMinus = ImageVector.Builder(
            name = "HomeMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                moveTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(18f)
                curveTo(14.69f, 12f, 12f, 14.69f, 12f, 18f)
                curveTo(12f, 18.7f, 12.12f, 19.37f, 12.34f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _HomeMinus!!
    }

@Suppress("ObjectPropertyName")
private var _HomeMinus: ImageVector? = null
