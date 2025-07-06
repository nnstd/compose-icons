package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconceFlatVariantOutline: ImageVector
    get() {
        if (_WallSconceFlatVariantOutline != null) {
            return _WallSconceFlatVariantOutline!!
        }
        _WallSconceFlatVariantOutline = ImageVector.Builder(
            name = "WallSconceFlatVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                moveTo(18.73f, 10.68f)
                lineTo(20.5f, 8.91f)
                lineTo(19.09f, 7.5f)
                lineTo(17.32f, 9.27f)
                lineTo(18.73f, 10.68f)
                moveTo(5.27f, 10.68f)
                lineTo(6.68f, 9.27f)
                lineTo(4.91f, 7.5f)
                lineTo(3.5f, 8.91f)
                lineTo(5.27f, 10.68f)
                moveTo(13f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _WallSconceFlatVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconceFlatVariantOutline: ImageVector? = null
