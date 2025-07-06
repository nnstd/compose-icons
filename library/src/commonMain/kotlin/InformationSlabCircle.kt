package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationSlabCircle: ImageVector
    get() {
        if (_InformationSlabCircle != null) {
            return _InformationSlabCircle!!
        }
        _InformationSlabCircle = ImageVector.Builder(
            name = "InformationSlabCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(14f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _InformationSlabCircle!!
    }

@Suppress("ObjectPropertyName")
private var _InformationSlabCircle: ImageVector? = null
