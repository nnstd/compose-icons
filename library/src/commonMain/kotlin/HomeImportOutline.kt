package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeImportOutline: ImageVector
    get() {
        if (_HomeImportOutline != null) {
            return _HomeImportOutline!!
        }
        _HomeImportOutline = ImageVector.Builder(
            name = "HomeImportOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                lineTo(11f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                lineTo(15f, 13f)
                moveTo(5f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(10.19f)
                lineTo(12f, 5.69f)
                lineTo(7.21f, 10f)
                horizontalLineTo(4.22f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _HomeImportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeImportOutline: ImageVector? = null
