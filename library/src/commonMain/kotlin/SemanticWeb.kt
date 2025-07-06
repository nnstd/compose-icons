package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SemanticWeb: ImageVector
    get() {
        if (_SemanticWeb != null) {
            return _SemanticWeb!!
        }
        _SemanticWeb = ImageVector.Builder(
            name = "SemanticWeb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.9f, 4.22f)
                curveTo(18.73f, 6.84f, 20f, 2f, 20f, 2f)
                reflectiveCurveTo(18.89f, 8.07f, 13.79f, 10.55f)
                curveTo(12.75f, 11.06f, 12.1f, 11.33f, 12.1f, 11.33f)
                lineTo(3.73f, 7.25f)
                lineTo(12.1f, 3.82f)
                curveTo(12.1f, 3.82f, 11.9f, 3.76f, 12.9f, 4.22f)
                moveTo(11.12f, 22f)
                lineTo(3.33f, 17.78f)
                verticalLineTo(9.07f)
                lineTo(11.12f, 13.04f)
                verticalLineTo(22f)
                moveTo(12.88f, 22f)
                lineTo(20.68f, 17.78f)
                verticalLineTo(9.07f)
                lineTo(12.88f, 13.04f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _SemanticWeb!!
    }

@Suppress("ObjectPropertyName")
private var _SemanticWeb: ImageVector? = null
