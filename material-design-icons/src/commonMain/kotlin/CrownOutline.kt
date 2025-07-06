package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrownOutline: ImageVector
    get() {
        if (_CrownOutline != null) {
            return _CrownOutline!!
        }
        _CrownOutline = ImageVector.Builder(
            name = "CrownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                lineTo(15f, 13.2f)
                lineTo(18f, 10.5f)
                lineTo(17.3f, 14f)
                horizontalLineTo(6.7f)
                lineTo(6f, 10.5f)
                lineTo(9f, 13.2f)
                lineTo(12f, 8f)
                moveTo(12f, 4f)
                lineTo(8.5f, 10f)
                lineTo(3f, 5f)
                lineTo(5f, 16f)
                horizontalLineTo(19f)
                lineTo(21f, 5f)
                lineTo(15.5f, 10f)
                lineTo(12f, 4f)
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                curveTo(5f, 19.6f, 5.4f, 20f, 6f, 20f)
                horizontalLineTo(18f)
                curveTo(18.6f, 20f, 19f, 19.6f, 19f, 19f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CrownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CrownOutline: ImageVector? = null
