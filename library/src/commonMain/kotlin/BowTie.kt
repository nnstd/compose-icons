package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BowTie: ImageVector
    get() {
        if (_BowTie != null) {
            return _BowTie!!
        }
        _BowTie = ImageVector.Builder(
            name = "BowTie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                lineTo(21f, 17f)
                verticalLineTo(7f)
                lineTo(15f, 10f)
                verticalLineTo(14f)
                moveTo(9f, 14f)
                lineTo(3f, 17f)
                verticalLineTo(7f)
                lineTo(9f, 10f)
                verticalLineTo(14f)
                moveTo(10f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _BowTie!!
    }

@Suppress("ObjectPropertyName")
private var _BowTie: ImageVector? = null
