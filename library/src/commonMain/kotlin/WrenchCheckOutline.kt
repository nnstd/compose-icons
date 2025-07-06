package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WrenchCheckOutline: ImageVector
    get() {
        if (_WrenchCheckOutline != null) {
            return _WrenchCheckOutline!!
        }
        _WrenchCheckOutline = ImageVector.Builder(
            name = "WrenchCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 1.09f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(1.09f)
                curveTo(4.16f, 1.57f, 2f, 4.03f, 2f, 7f)
                curveTo(2f, 9.22f, 3.21f, 11.15f, 5f, 12.19f)
                verticalLineTo(21f)
                curveTo(5f, 21.55f, 5.45f, 22f, 6f, 22f)
                horizontalLineTo(10f)
                curveTo(10.55f, 22f, 11f, 21.55f, 11f, 21f)
                verticalLineTo(12.19f)
                curveTo(12.79f, 11.15f, 14f, 9.22f, 14f, 7f)
                curveTo(14f, 4.03f, 11.84f, 1.57f, 9f, 1.09f)
                moveTo(10f, 10.46f)
                lineTo(9f, 11.04f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(11.04f)
                lineTo(6f, 10.46f)
                curveTo(4.77f, 9.74f, 4f, 8.42f, 4f, 7f)
                curveTo(4f, 6f, 4.37f, 5.06f, 5f, 4.35f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(4.35f)
                curveTo(11.63f, 5.06f, 12f, 6f, 12f, 7f)
                curveTo(12f, 8.42f, 11.23f, 9.74f, 10f, 10.46f)
                moveTo(21.6f, 13f)
                lineTo(23f, 14.41f)
                lineTo(16.47f, 21f)
                lineTo(13f, 17.5f)
                lineTo(14.4f, 16.09f)
                lineTo(16.47f, 18.17f)
                lineTo(21.6f, 13f)
            }
        }.build()

        return _WrenchCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WrenchCheckOutline: ImageVector? = null
